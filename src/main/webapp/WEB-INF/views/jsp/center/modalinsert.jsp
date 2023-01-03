<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div id="modal" class="insertModal">
	<div class="modal-content">
		<div id="center-modal-total">
			<div id="center-modal-mainbar">
				<p>사진 등록</p>
				<button id="centermodal-close-btn">✖</button>
			</div>
			<div id="centermodal-insertphoto-info">
				<table id="centermodal-insert">
					<tr>
					<th>사진명</th>
					<td>(강원)강릉센터1.jpg</td>
					<th>외관/내부</th>
					<td>
						<select>
							<option>외관</option>
							<option>내부</option>
						</select>
					</td>
					</tr>
				</table>
			</div>
			<div id="center-search-bar">
				<input type="file">
			</div>
			<div id="centermodal-photo-list">
				<table id="centermodal-originalphoto-info">
					<tr>
						<th>사진 번호</th>
						<th>원본 사진명</th>
					</tr>
					<tr>
						<td>/</td>
						<td>/</td>
					</tr>
					<tr>
						<td>/</td>
						<td>/</td>
					</tr>
				</table>
				<button id="centermodal-photo-insert">등록</button>
			</div>
		</div>
	</div>
	<div class="modal-layer"></div>
</div>