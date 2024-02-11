package by.itacademy.user.service.verificationCodeDelivery;

import by.itacademy.user.dao.User;


public interface DeliveryCodeService {
    void deliverCode(User user, String code);

    String getCode();

}
