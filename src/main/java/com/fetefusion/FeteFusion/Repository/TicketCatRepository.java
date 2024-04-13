package com.fetefusion.FeteFusion.Repository;

import com.fetefusion.FeteFusion.Model.TicketCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketCatRepository extends JpaRepository<TicketCategory, Long> {
}
