# 센터관리프로그램 - 헌혈의 집
<p align="center"><img src="https://user-images.githubusercontent.com/114052638/236240737-6a604384-3cfc-4dfd-bb96-0e47f6b216b5.png" width ="300"></p>

## 1. 제작 기간
2022년 12월 12일 ~ 2023년 2월 22일

</br>

## 2. 참여 인원
### 팀 프로젝트(풀스택 4명)
- 고은별
- 정윤선
- 이소정
- 임유진

</br>

## 3. 개발환경
### 개발환경
- 전자정부프레임워크 3.9
- Spring Framework 5.3.8
- MyBatis 3.5.7

### 서버 및 데이터베이스
- Tomcat 9.0
- Oracle SQL Developer 11.2.0.2.0

### TOOL
- GitHub
- Slack
- 구글 드라이브

### 라이브러리
- jQuery
- Sitemesh
- POI 4.1.2
- BootStrap 3.6.1

### 사용언어
- JAVA	
- HTML
- CSS
- JavaScript
- JDK 18.0.2

</br>

## 4. 프로젝트 주제
센터 관리 시스템을 통해 입력된 각종 자료는 약점뿐 아니라 강점 파악, 재고 및 담당자 관리 등 관리자에게 필요한 다양한 정보를 제공함으로써 효율성을 향상시켜 줍니다.
또한 권한에 따른 메뉴 접근을 제공하여 보다 체계적인 센터 운영을 제공합니다.

</br>

## 5. 주요 업무 및 상세역할
- 담당자 CRUD & 검색, 필터링 기능
- POI 라이브러리를 이용한 엑셀 일괄 업로드 기능
- 로그인 기능
- 메인 페이지 구현
</br>

## 6. ERD
![image](https://user-images.githubusercontent.com/114052638/236238682-af889e61-b1df-4e3a-a7e7-85a71416592f.png)

## 7. 핵심 기능
### POI lib를 이용한 엑셀 엡로드
#### > 화면
<img src="https://user-images.githubusercontent.com/114052638/236246622-a78c09bc-eea2-4429-bdf7-5aefed0383b6.png" width ="400">
파일 선택을 한 뒤, 업로드를 하면 POI lib를 이용한 엑셀 일괄업로드 가능

#### > POI CLASS
<img src="https://user-images.githubusercontent.com/114052638/236241938-ecd4fedc-ea0e-4524-bd87-f06662824e1b.png" width ="400">

- getInputStream 으로 파일 컨텐츠를 읽은 뒤, 엑셀파일로 Workboook 인스턴스 생성을 하고 첫번째 시트를 가져온다
- 모든 row 조회를 위한 반복자를 획득한 뒤 행에 들어있는 정보들을 담을 List를 생성한다.
- while 문을 통해 모든 행을 조회한다
- rowlter.next() 로 한 줄씩 얻어옥 if문을 통해 몇번쨰 줄부터 읽을지 조건을 걸어준다
- 모든 cell 조회를 위한 반복자를 획득한 뒤 whlie 문을 통해 모든 cell을 조회한다.
- cellIter.next()로 한개의 셀씩 얻어오고 읽은 데이터의 vo를 List에 담아준다.
#### > CENTER SERVICE
<img src="https://user-images.githubusercontent.com/114052638/236247304-d385082e-e4b8-48d8-b072-94ad09c7b94f.png" width ="600">

- 엑셀 업로드를 위한 센터 등록은 신규는 0으로, 수정은 기존에 존재하던 센터코드로 입력해야 한다.
- replace를 이용하여 insert와 update에 해당하는 value를 증가시켜 입력 또는 수정된 데이터의 수를 나타낸다.

</br>

### POI lib를 이용한 엑셀 다운로드
#### > 화면
<img src="https://user-images.githubusercontent.com/114052638/236249052-73b7947c-319f-4d78-87ff-80f406921b15.png" width ="600">
센터, 담당자, 점수 조회 페이지에서 버튼 클릭 시 조회된 정보를 엑셀 파일로 다운로드 가능

#### > CENTER CONTROLLER
<img src="https://user-images.githubusercontent.com/114052638/236250401-943620e8-e8b2-4ad3-b9b8-e77dfa86b7ce.png" width ="600">

- 검색 조건에 맞는 파일명 설정
- 새 workbook 인스턴스와 시트 생성
- 첫 줄을 생성해 알맞는 할목명을 작성

<img src="https://user-images.githubusercontent.com/114052638/236250567-e92fc221-14f1-42c7-8e2e-3f8ba94b27ea.png" width ="600">
조회된 정보들을 셀에 알맞게 삽입한 후, 지정해둔 경로롸 이름으로 엑셀 파일을 




