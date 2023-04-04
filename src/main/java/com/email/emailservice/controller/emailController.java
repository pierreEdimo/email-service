package com.email.emailservice.controller;

import com.email.emailservice.model.Help;
import com.email.emailservice.model.dto.ConfirmationEmailDto;
import com.email.emailservice.model.dto.OrderEmailDto;
import com.email.emailservice.model.dto.UpdateEmailDto;
import com.email.emailservice.service.EmailService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("")
public class emailController {
    private final EmailService service;

    @Operation(
            summary = "Envoie un E-mail a au vendeur apres une commande effectuee. ",
            description = "Lorsque l'utilisateur envoie une commande, un email est envoye" +
                    "au vendeur. Dans cet E-Mail, il y'a des informations necessaires pour pouvoir effectuer" +
                    "la commande avec succes. "
    )
    @ApiResponses(
            value = {
                    @ApiResponse(responseCode = "200", description = "L'E-Mail a ete envoye avec succes.")
            }
    )
    @PostMapping("order")
    public void sendOrderConfirmationEmail(@RequestBody OrderEmailDto newEmail) {
        this.service.sendOrderEmail(newEmail);
    }

    @Operation(
            summary = "Envoie un E-mail au client apres une commande ",
            description = "Lorsque l'utilisateur envoie une commande, un email est envoye au client pour lui " +
                    "faire la remarque que la commande a ete recu avec succes"
    )
    @ApiResponses(
            value = {
                    @ApiResponse(responseCode = "200", description = "L'E-Mail a ete envoye avec succes.")
            }
    )
    @PostMapping("confirmation")
    public void SendConfirmationEmail(@RequestBody ConfirmationEmailDto newEmail) {
        this.service.sendConfirmationEmail(newEmail);
    }

    @Operation(
            summary = "Envoie un E-mail au client a chaque fois que le vendeur change le status de la commande",
            description = "Lorsque le vendeur met la commande un jour, un e-mail est envoye a l'utilisateur pour lui " +
                    "notifier du status de la commande."
    )
    @PostMapping("update")
    public void sendUpdateEmail(@RequestBody UpdateEmailDto newEmail) {
        this.service.sendUpdateEmail(newEmail);
    }

    @Operation(
            summary = "Envoie un E-mail au du vendeur au fournisseur de Houlala"
    )
    @ApiResponses(
            value = {
                    @ApiResponse(responseCode = "200", description = "L'email a ete envoye avec succes.")
            }
    )
    @PostMapping("help")
    public void sendHelpEmail(@RequestBody Help newEmail) {
        this.service.sendHelpEmail(newEmail);
    }
}
