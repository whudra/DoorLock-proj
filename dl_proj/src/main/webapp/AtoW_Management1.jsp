<%@page import="DAO.UserDAO"%>
<%@page import="DTO.UserDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<% 
	String sn = request.getParameter("sn");
	UserDTO dto = new UserDTO();
	dto.setSerialNumber(sn);
	
	UserDTO res = UserDAO.getInstance().getUserinfoSerial(dto);
	out.print(res.getIp() + "/" + res.getPort());
%>