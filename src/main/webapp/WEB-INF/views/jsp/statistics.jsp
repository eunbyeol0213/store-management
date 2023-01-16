<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/statistics.css"/>
<div class="titleBox">
<img src="${pageContext.request.contextPath}/resources/images/trend.png">
<h2>통계보기</h2>
</div>
<div id="buttonsdiv">
	<button class="menubtn center clicked">센터별</button><button class="menubtn manager">담당자별</button><button class="menubtn code">점수항목별</button><button class="menubtn">TOP3</button>
</div>
<div id="statisticcontentdiv">
	<div id="searchlistdiv">
		<div class="search-box">
			<input type="text" class="search-txt" name="" placeholder="검색">
			<a class="search-btn" href="#"> <i class="fas fa-search"
				aria-hidden="true"></i>
			</a>
		</div>
		<div id="centertablediv">
			<table id="centerlisttable" border="1" class="center table">
				<c:forEach items="${centerList}" var="center">
					<tr>
						<td class="listitem" id="center${center.centerCode}">${center.centerName}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
		
		<table id="managerlisttable" border="1" class="manager table">
			<tr>
				<td class="listitem">이소정</td>
			</tr>
			<tr>
				<td class="listitem">고은별</td>
			</tr>
			<tr>
				<td class="listitem">정윤선</td>
			</tr>
			<tr>
				<td class="listitem">임유진</td>
			</tr>
			<tr>
				<td class="listitem">이정림</td>
			</tr>
			<tr>
				<td class="listitem">정가영</td>
			</tr>
			<tr>
				<td class="listitem">김영서</td>
			</tr>
			<tr>
				<td class="listitem">최혜민</td>
			</tr>
			<tr>
				<td class="listitem">한혜원</td>
			</tr>
			<tr>
				<td class="listitem">김나영</td>
			</tr>
			<tr>
				<td class="listitem">이영진</td>
			</tr>
		</table>
		
		<table id="codelisttable" border="1" class="code table">
			<tr>
				<td class="listitem">센터 내부 위생관리</td>
			</tr>
			<tr>
				<td class="listitem">의료폐기용품 관리</td>
			</tr>
			<tr>
				<td class="listitem">의료기구 관리</td>
			</tr>
			<tr>
				<td class="listitem">개인위생 관리</td>
			</tr>
			<tr>
				<td class="listitem">문서보안 관리</td>
			</tr>
			<tr>
				<td class="listitem">채혈 및 간호 업무</td>
			</tr>
			<tr>
				<td class="listitem">프로모션 이행</td>
			</tr>
			<tr>
				<td class="listitem">헌혈유보군 관리</td>
			</tr>
			<tr>
				<td class="listitem">헌혈 혈액 상태 관리</td>
			</tr>
			<tr>
				<td class="listitem">채혈 기구 예산안 적정성</td>
			</tr>
			<tr>
				<td class="listitem">채혈자 기념품 예산안 적정성</td>
			</tr>
		</table>
	</div>
	<div id="rightdiv">

		<div id="graphdiv">
			<h2 id="graphtitle"><p id="centername"></p> <p id="statisticcontent">평균 점수 추이</p></h2>
			<div id="container"></div>
		</div>
		<div id="infodiv">
			<div>
			<p class="title-p">전체 센터 수</p>
		 	<p class="colored-p">127</p>
		 	</div>
		 	<div>
		 	<p class="title-p">전체 센터 평균 점수</p>
		 	<p class="colored-p">68.9</p>
		 	</div>
		 	<div>
		 	<p class="title-p">선택 센터 1년 평균 점수</p>
		 	<p class="colored-p">73.5</p>
		 	</div>
		</div>
		
	</div>
</div>
<script src="https://code.highcharts.com/highcharts.js"></script>
<script src="https://code.highcharts.com/modules/exporting.js"></script>
<script src="https://code.highcharts.com/modules/export-data.js"></script>
<script src="https://code.highcharts.com/modules/accessibility.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/statistics.js"></script>