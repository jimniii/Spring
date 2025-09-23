package kr.co.ch06.repository;

import kr.co.ch06.entity.Child;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ChildRepository extends JpaRepository<Child, String> { // <엔티티, 해당 엔티티의 @ID 속성 자료형>

}