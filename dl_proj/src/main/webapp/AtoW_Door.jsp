<%@page import="DTO.LogDTO"%>
<%@page import="DAO.LogDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String serial =  request.getParameter("Serial");
	String door_state = request.getParameter("Door");
	
	LogDAO dao = new LogDAO();
	LogDTO dto = new LogDTO();
	
	dto.setSerial_number(serial);
	dto.setState(door_state);
	
	dao.getInstance().updateLog(dto);
%>