<%@page import="DAO.UserDAO"%>
<%@page import="DTO.UserDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<% 
	String sn = request.getParameter("sn");
	String ip = request.getParameter("ip");
	String port = request.getParameter("port");
	String a_pw = request.getParameter("a_pw");
	String d_pw = request.getParameter("d_pw");
	String name = request.getParameter("name");
	UserDTO dto = new UserDTO();
	dto.set_All(sn, ip, port, a_pw, d_pw, name);
	
	String res = UserDAO.getInstance().add_User(dto);
	out.print(res);
%>