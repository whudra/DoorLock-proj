<%@page import="java.util.ArrayList"%>
<%@page import="DTO.LogDTO"%>
<%@page import="DAO.LogDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String view =  request.getParameter("View");
	
	LogDAO dao = new LogDAO();
	ArrayList<LogDTO> list = new ArrayList<>();
	
	if(view.equals("1")){
		list = dao.getInstance().Loginfo();
		for(LogDTO dto : list){
			out.print(dto.getSerial_number() + "," + dto.getDate() + "," + dto.getState() + "/");
		}
	}
%>