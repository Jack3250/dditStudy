package kr.or.ddit.prod.controller;

import java.io.IOException;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.or.ddit.prod.service.IProdService;
import kr.or.ddit.prod.service.ProdServiceImpl;
import kr.or.ddit.vo.ProdTypeVo;

@WebServlet("/typeList2")
public class TypeListController extends HttpServlet{
	
	IProdService prodService = ProdServiceImpl.getInstance();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String typeNo = req.getParameter("typeNo");
		
		ProdTypeVo prodTypeVo = new ProdTypeVo();
		prodTypeVo.setParentNo(Integer.parseInt(typeNo));
		
		List<ProdTypeVo> typeList2 = prodService.typeList2(prodTypeVo);
		
		resp.setContentType("application/json");
		
		JSONArray jsonArray = new JSONArray();
		
		for(ProdTypeVo typeVo : typeList2) {
			JSONObject obj = new JSONObject();
			obj.put("typeNo", typeVo.getTypeNo());
			obj.put("typeName", typeVo.getTypeName());
			jsonArray.add(obj);
		}
		
		resp.getWriter().write(jsonArray.toJSONString());
	}
	
}