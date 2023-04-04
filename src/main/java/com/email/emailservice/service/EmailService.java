package com.email.emailservice.service;

import com.email.emailservice.model.Help;
import com.email.emailservice.model.dto.ConfirmationEmailDto;
import com.email.emailservice.model.dto.OrderEmailDto;
import com.email.emailservice.model.dto.UpdateEmailDto;

public interface EmailService {
    /**
     * Envoie un E-mail lorsqu'une commande a ete effectue
     *
     * @param newEmail Les Inforamtions qui doivent etre envoye.
     */
    void sendOrderEmail(OrderEmailDto newEmail);

    /**
     * Envoie un E-mail lorsque l'utilisateur a confirme la commande
     *
     * @param newEmail Les Informations qui doivent etre confirme.
     */
    void sendConfirmationEmail(ConfirmationEmailDto newEmail);

    /**
     * Envoie un E-mail lorsque le vendeur met la commande a jour.
     *
     * @param newEmail Les Informations qui sont ecrites dans l'E-mail
     */
    void sendUpdateEmail(UpdateEmailDto newEmail);

    /**
     * Envoie un message d'aide
     *
     * @param newEmail Les informations qui sont ecrites dans l'E-mail
     */
    void sendHelpEmail(Help newEmail);
}
