<jsp:include page="cabecalho.jsp" />
<script>

    $(document).ready(function () {
        $("#submit1").hover(
                function () {
                    $(this).animate({"opacity": "0"}, "slow");
                },
                function () {
                    $(this).animate({"opacity": "1"}, "slow");
                });
    });

</script>	

<script type="text/javascript">

    var REST_URL = "http://localhost:11233/ProjetoKiccWebService/webresources/clientes";

    $("#logar").click(function () {
        $.ajax({
            type: "GET",
            url: REST_URL + "/" + $("#email").val() + "/" + $("#senha").val(),
            success: function (data) {

                if (data === "200") {
                    alert('ok');
                } else {
                    alert('erro');
                    //window.location.href = "../recupSenha";
                }

                //$("#resposta").html(data);
            }
        });
        return (false);
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
                        <form id="login" name="login">
                            <input type="text" name="email" id="email" value="E-mail Address" onclick="this.value = ''">
                            <img id="url_user" src="./images/mailicon.png" alt="">

                            </div>
                            <div id="username_inputright"></div>
                    </div>
                    <div id="password_input">
                        <div id="password_inputleft"></div>
                        <div id="password_inputmiddle">

                            <input type="password" name="senha" id="senha" value="Password" onclick="this.value = ''">
                            <img id="url_password" src="./images/passicon.png" alt="">

                        </div>
                        <div id="password_inputright"></div>
                    </div>
                    <div id="submit">
                        <input type="submit" id="logar" name="logar" value="Entrar">

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