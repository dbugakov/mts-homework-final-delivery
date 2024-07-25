package ru.siebel.delivery.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import ru.siebel.order.dto.Order;

@FeignClient(
        name = "DeliveryApi",
        url = "localhost:7777"
)
public interface DeliveryApi {

    @PostMapping("/deliveryOrder")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deliveryOrder(@RequestBody Order dto);
}