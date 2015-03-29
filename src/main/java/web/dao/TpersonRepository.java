package web.dao;

import org.springframework.data.repository.CrudRepository;

import web.po.Tperson;

public interface TpersonRepository extends CrudRepository<Tperson, Long> {

}
