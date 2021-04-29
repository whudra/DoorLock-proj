<%@page import="DAO.UserDAO"%>
<%@page import="DTO.UserDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<% 
	String pw = request.getParameter("Password");
	UserDTO dto = new UserDTO();
	dto.setA_pw(pw);
	
	String res = UserDAO.getInstance().check_Password(dto);
	out.print(res);
%>