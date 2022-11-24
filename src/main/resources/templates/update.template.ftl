<html lang="fr" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Poppins" rel="stylesheet">
    <title>Houlala</title>
</head>

<body>

<div class="email-container">
    <hr>
    <section class="update-container">
        <h1>Houlala</h1>
        <h3 class="title">
                Nouvelle Commande
            </h3>
        <p>
            Chère (cher) Monsieur/Madame ${lastName} ${firstName}, <br>
            ${body}
        </p>
    </section>
</div>

</body>

<style>
    body {
        font-family: 'Poppins', sans-serif;
        background-color: #ffffff;
        position: relative;
    }

    h1 {
        font-size: 32px;
        text-align: center;
        margin: 0;
    }

    .title {
        font-size: 22px;
        text-align: center;
        margin: 0;
    }


    p {
        margin: 0;
        font-size: 14px;
        text-align: center;
    }

    .email-container {
        width: 60%;
        margin: auto;
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        position: absolute;
        top: 50%;
        left: 50%;
        transform: translate(-50%, -50%);
    }
</style>
</html>