package ru.siebel.delivery.service.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.siebel.order.api.OrderApi;
import ru.siebel.order.dto.Order;
import ru.siebel.order.dto.enums.StatusEnum;

@Service
@RequiredArgsConstructor
public class DeliveryService {

    private final OrderApi orderApi;

    public void deliveryOrder(Order dto) {
        dto.setStatus(StatusEnum.DELIVERED.getValue());
        orderApi.updateOrder(dto);
    }
}
