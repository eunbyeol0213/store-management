<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<link rel="stylesheet" type="text/css" href="resources/css/score.css"/>

<script type="text/javascript">
$(function(){ 

	  $("button").click(function(){
	    $(".modal").fadeIn();
	  });
	  
	  $(".modal_content").click(function(){
	    $(".modal").fadeOut();
	  });
	  
	});
</script>


   
<h1>정윤선 담당자</h1>
<form>
  <select name="year" >
    <option value="none">점검년도</option>
    <option value="2022">2022</option>
    <option value="2021">2021</option>
    <option value="2020">2020</option>
    <option value="2019">2019</option>
  </select>
</form>

<form>
  <select name="quarter_of_ a_year" >
    <option value="none">분기</option>
    <option value="4">4 분기</option>
    <option value="3">3 분기</option>
    <option value="2">2 분기</option>
    <option value="1">1 분기</option>
  </select>
</form> 
<table border="1">
	<th>점검년도</th>
	<th>분기</th>
	<th>항목</th>
	<th>상세항목</th>
	<th>점수</th>
	<tr>
	<td>2022</td>
	<td>분기</td>
	<td>위생</td>
	<td>매장위생관리</td>
	<td><input type="text" size="5" placeholder="점수 수정">
	</tr>

</table>


 <button id ="open">수정</button>
 <div class="modal_hidden">
  
  <div class="modal_overlay"></div>
  <div class="modal_content">
  <h1 class="modalh1">여기는 모달창 입니다.</h1>
	<button>등록</button>
	<button>취소</button>

  </div>
</div>
  <input type="button" value="점수 등록">
  <script>
  const openButton=document.getElementById("open");
  const openModal= () => {}
  openButton.addEventListener("click",openModal);
  </script>


