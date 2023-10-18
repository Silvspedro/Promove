<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="estilo.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
        integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
    <link rel="stylesheet" href="css/style-anuncio.css">
    <link rel="shortcut icon" href="img/LogoSample-sem-fundo.png" type="image/x-icon">
    <title>Promove</title>
</head>

<body>
    <!-- Cabe�alho superior -->
    <header>

        <div id="title">
            <a href="Pagina-inicial.html"><img src="img/logo2-laranja.jpg" alt=""></a>
        </div>
        <ul class="menu-inicial">
            <a href="#">
                <li>Eventos</li>
            </a>
            <a href="#">
                <li>Servi�os</li>
            </a>
            <a href="sobre.html">
                <li>Sobre</li>
            </a>
            <a href="#">
                <li>Contatos</li>
            </a>
            <a href="..//PaginaWeb_Login.html" class="btn-comum" id="inscrave-se-bnt">
                <li>j� tem uma conta?</li>
            </a>
        </ul>
    </header>

    <main>
   
        <div class="container-controlador" id="controle-login">
            <div class="form">
                <div class="trabalhe-conosco">
                    <form action="Pagina-inicial.html" method="get">
                        <h1 id="titlle-cofirm">Login Efetuado com Sucesso</h1>
                        
                        <img src="img/green-check-pagamento.png" id="check-pagamento" alt="Pagamento confimado">

                        <button type="submit" class="btn-comum" id="btn-enviar-banco">Retornar a Pagina inicial</button>

                    </form>
                </div>
            </div>
        </div>

    </selection>
    </main>
    <footer>

        <div class="logo-rodape">
            <a href="Pagina-inicial.html">
                <img src="img/logo2-preto.jpg" alt="">
            </a>
        </div>
        <div class="menu-rodape">
            <ul>

                <a href="quem-somos.html">
                    <li>Quem somos</li>
                </a>
                <a href="politicas-pricacidade.html">
                    <li>Pol�tica de privacidade</li>
                </a>
                <a href="termos-uso.html">
                    <li>Termos de uso</li>
                </a>
               
                <a href="trabalhe-conosco.html">
                    <li>Trabalhe Conosco</li>
                </a>
            </ul>

        </div>
        <div class="informacoes-finais">

            <!--  <img src="img/meios-pagamento-rodape-sem-fundo.png" alt="Meios de pagamento aceitos pelo site"> -->

            <p>PROMOVE EVENTOS LTDA | CNPJ: 00.001.987/0006-54 </p>

            <P>SIGA �rea Especial para Ind�stria Lote 2/3, Sce St. Leste Industrial - Gama, Bras�lia - DF, CEP 72445-020
            </p>

            <P>Copyright � 2023 Promove eventos. Todos os direitos reservados</p>
        </div>
    </footer>
</body>

</html>