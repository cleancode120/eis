package com.kun.eis.project.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kun.eis.common.util.BoardUtil;
import com.kun.eis.project.service.ProjectService;
import com.kun.eis.project.vo.ProjectVO;

@Controller
public class ProjectController {

	private static final Logger logger = LoggerFactory.getLogger(ProjectController.class);
	
	@Autowired
	private ProjectService projectService;
	
	@RequestMapping(value="/")
	public String testHome(@ModelAttribute("searchVO") ProjectVO vo, Model model, HttpSession session) throws Exception {	
		
		return "/test/testHome.tiles";
	}
	
	/**
	 * test항목 검색Family Site
	 * 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/testList")
	public String testList(@ModelAttribute("searchVO") ProjectVO vo, Model model, HttpSession session) throws Exception {	
		
		// 게시판 UTIL
		BoardUtil boardUtil = new BoardUtil();
		List<ProjectVO> testList = null;
		
		try {
			
			/**
    	    * 게시판 기능
    	    */
    		int totalRecordCount = 0; 								// 총 게시물 건수
    		int currentPageNo = vo.getCurrentPageNo(); 				// 현재 클릭한 page 번호
    		int pageSize = vo.getPageSize(); 						// 페이지 리스트에 게시되는 페이지 건수
    		int recordCountPerPage = vo.getRecordCountPerPage();	// 한 페이지당 게시되는 게시물 건 수 
    		
    		// 게시물 조회 범위 연산
    		HashMap<String, Integer> rangeMap = boardUtil.calcDataRange(currentPageNo, recordCountPerPage);
    		vo.setStart(rangeMap.get("firstRecordIndex"));
    		vo.setEnd(rangeMap.get("lastRecordIndex"));
    		
			// 전체 검색 결과
			testList = projectService.testList(vo);
			
			// 검색된 결과가 있는지 체크
    		if(testList.size() > 0){
    			// 전체 검색 결과 게시물 건 수
    			totalRecordCount = testList.get(0).getTotalRecordCount();
    		}
			
    		// pager 기능 모든 계산식 결과 정보 map에 담기
    		HashMap<String, Integer> pagerMap = boardUtil.calcBoardPagerElement(currentPageNo, totalRecordCount, recordCountPerPage, pageSize);
    		/**
     	    * 게시판 END
     	    */
    		
    		// model 세팅
			model.addAttribute("testList", testList ); //검색한 list정보
			model.addAttribute("pagerMap", pagerMap); //게시판 계산식 map
			
		} catch (Exception e) {
			
			logger.info(e.getMessage()); 
			e.printStackTrace(); 
		}
		
		return "/test/test.tiles";
	}
	
	/**
	 * ajax test
	 * 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/ajax_testAjax.ajax")
	@ResponseBody
	public Object procEqpmntManage(@ModelAttribute("vo") ProjectVO vo, Model model, HttpSession session) throws Exception {	
		
		HashMap<String, Object> resultMap = new HashMap<String, Object>();
		// 결과 성공여부
		boolean rstFlag = false;
		ProjectVO projectVO = null;
		
		try {
		    			
			projectVO = projectService.selectPwCode(vo);
			rstFlag = true;
			
		} catch (Exception e) {
			
			rstFlag = false;
			logger.debug(e.getMessage());
			e.printStackTrace();
			
		} finally {
			
			resultMap.put("rstFlag", rstFlag);
			resultMap.put("projectVO", projectVO);
		}
		
		return resultMap;
	}
}