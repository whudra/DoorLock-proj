<%@page import="DAO.UserDAO"%>
<%@page import="DTO.UserDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<% 
	String serial = request.getParameter("Serial");
	UserDTO dto = new UserDTO();
	dto.setSerialNumber(serial);
	
	String res = UserDAO.getInstance().getAdminState(dto);
	out.print(res);
%>