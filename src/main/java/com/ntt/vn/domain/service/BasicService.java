package com.ntt.vn.domain.service;

/**
 * Created by bangnl on 2/27/16.
 */

import com.ntt.vn.domain.model.Model;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;

public interface   BasicService <T extends Model>{
    void save(T model);
    void update(T model);
    void delete(Long id);
    T findById(Long id);
    Page<T> findAll(Pageable pageable);
}
