<html lang="fr" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Poppins" rel="stylesheet">
    <title>Houlala</title>
</head>

<body>

<div class="email-container">
    <section class="center">
        <h1>Houlala</h1>
    </section>
    <hr>
    <section class="bestaetigung-container center">
        <br>
        <br>
        <span class="title">
                Information
            </span>
        <p>
            Chère (cher) Monsieur/Madame ${lastName} ${firstName} <br>

            ${body}

            Nous vous informerons par e-mail dès que votre commande aura quitté notre centre d'expédition.
        </p>
        <br>
        <br>
    </section>
    <hr>
    <section class="right center">
        <br>
        <br>
        <p>Pour toute question, veuillez contacter le vendeur via son adresse e-mail: ${sellerEmail}</p>
        <p><b>Contact de Houlala:</b> +237 6 97 59 04 70</p>
    </section>
</div>

</body>

<style>
    body {
        font-family: 'Poppins', sans-serif;
        background-color: #ffffff;
    }

    h1 {
        font-size: 32px;
    }

    .title {
        font-weight: bolder;
        font-size: 22px;
    }

    .small-title {
        font-weight: bolder;
        font-size: 18px;
    }

    p {
        margin: 0;
        font-size: 14px;
    }

    .email-container {
        padding: 20px;
        width: 40%;
        margin: auto;
    }

    .center {
        display: flex;
        flex-direction: column;
        justify-content: center;
        align-items: center;
    }

    .item-content-container {
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
    }

    .product-image {
        width: 240px;
    }

    p {
        text-align: center;
    }
</style>
</html>