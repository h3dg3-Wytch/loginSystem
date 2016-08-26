package hello.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by h3dg3wytch on 8/19/16.
 */
@Repository
public class Search {

    @Autowired
    protected JdbcTemplate jdbc;

    public Search(){

    }





}
