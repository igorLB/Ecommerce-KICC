<jsp:include page="cabecalho.jsp" />
	 <script>

	$(document).ready(function(){
	$("#submit1").hover(
	function() {
	$(this).animate({"opacity": "0"}, "slow");
		},
	function() {
	$(this).animate({"opacity": "1"}, "slow");
		});
 	});

	</script>	
</head>
<body>
<div class="container">
	<div id="wrapper">
		<div id="wrappertop"></div>
		<div id="wrappermiddle">
			<h2>Login</h2>
			<div id="username_input">
				<div id="username_inputleft"></div>
				<div id="username_inputmiddle">
				<form>
					<input type="text" name="link" id="url" value="E-mail Address" onclick="this.value = ''">
					<img id="url_user" src="./images/mailicon.png" alt="">
				</form>
				</div>
				<div id="username_inputright"></div>
			</div>
			<div id="password_input">
				<div id="password_inputleft"></div>
				<div id="password_inputmiddle">
				<form>
					<input type="password" name="link" id="url" value="Password" onclick="this.value = ''">
					<img id="url_password" src="./images/passicon.png" alt="">
				</form>
				</div>
				<div id="password_inputright"></div>
			</div>
			<div id="submit">
				<form>
				<input type="image" src="./res/images/submit_hover.png" id="submit1" value="Entrar">
				<input type="image" src="./res/images/submit.png" id="submit2" value="Entrar">
				</form>
			</div>
			<div id="links_left">
			<a href="#">Esqueceu a senha?</a>
			</div>
			<div id="links_right"><a href="#">Não é cadastrado ainda?</a></div>
		</div>
		<div id="wrapperbottom"></div>
		<div id="powered">
		</div>
	</div>
</div>