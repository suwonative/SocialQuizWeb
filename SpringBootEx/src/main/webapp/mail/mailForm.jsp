<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<<<<<<< HEAD
	<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
 <html>
 <head>
	<script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>

    <meta charset="UTF-8">
    <title>mail test</title>
 </head>
 <body>
		이메일을 입력하세요 : <input type="text" name="toEmail">
		<input type="submit" value="전송" name="btn_submit">
		<br>
        <input type="text" name="emailAuth" style="display:none">
        <input type="submit" value="인증" name="btn_auth" style="display:none">
	<script type = "text/javascript">
		let test=null;
		let user_key=null;

		window.addEventListener("DOMContentLoaded",()=>{
            let btn_submit = document.querySelector("input[name='btn_submit']");
			let btn_auth= document.querySelector("input[name='btn_auth']");
			let emailAuth= document.querySelector("input[name='emailAuth']");
            btn_submit.addEventListener("click",()=>{
				let toEmail = document.querySelector("input[name='toEmail']").value;
				
				if(toEmail != ""){
					test = fetch('/sendmail', {

					  method: 'POST',
					  body: toEmail,

					})
					 .then((data) => {
					
					})
					 .catch(
						error => console.log('Error:', error)
						);

						btn_auth.setAttribute("style","");
						emailAuth.setAttribute("style","");
						
					}
				else{
					alert("이메일을 입력해주세요.");
				}
			
				});
			 btn_auth.addEventListener("click",()=>{
				
				if(user_key==emailAuth.value){
					alert("일치합니다.");
				}
				else{
					alert("불일치");
				}
			});
		
        });
		
 	</script>

  </body>
  </html>
=======
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>mail test</title>
</head>
<body>
    <!-- 이메일 전송 폼 -->
    <form action="/sendmail" method="post">
        이메일을 입력하세요:
        <input type="text" name="toEmail" required>
        <input type="submit" value="전송">
    </form>

    <br>

    <!-- 인증번호 확인 폼 -->
    <form action="/sendmailcheck" method="post">
        <input type="text" name="emailAuth" placeholder="인증번호 입력" required>
        <input type="submit" value="인증">
    </form>
</body>
</html>
>>>>>>> 94559a698e65f1ec2f19c305832979a4fe60f9d7
