<%@page import="DAO.UserDAO"%>
<%@page import="DTO.UserDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<% 
	String sn = request.getParameter("sn");
	UserDTO dto = new UserDTO();
	dto.setSerialNumber(sn);
	
	String res = UserDAO.getInstance().del_User(dto);
	out.print(res);
%>