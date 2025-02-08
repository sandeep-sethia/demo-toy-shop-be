package com.test.demo_be.repositories;

import com.test.demo_be.models.ToyOrder;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

@Repository
public interface ToyOrderRepository extends JpaRepository <ToyOrder, Long>{
    ToyOrder save(ToyOrder toyOrder);
    List<ToyOrder> findAll();
}
