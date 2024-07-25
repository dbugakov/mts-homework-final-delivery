package ru.siebel.delivery.service.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import ru.siebel.delivery.api.DeliveryApi;
import ru.siebel.delivery.service.service.DeliveryService;
import ru.siebel.order.dto.Order;

@RestController
@RequiredArgsConstructor
public class DeliveryController implements DeliveryApi {

    private final DeliveryService deliveryService;

    @Override
    public void deliveryOrder(Order dto) {
        deliveryService.deliveryOrder(dto);
    }
}
