package com.ascodev.tacos.repository;

import com.ascodev.tacos.entity.TacoOrder;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<TacoOrder, String> {
    List<TacoOrder> findTacoOrderByDeliveryCity(String deliveryCity);
}
