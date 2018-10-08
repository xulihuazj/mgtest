package com.xulihuazj.mgsubtest.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xulihuazj.mgsubtest.util.OrderSortParse;
import com.xulihuazj.mgsubtest.util.PageModel;
import org.apache.commons.lang3.ArrayUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.util.CollectionUtils;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import static org.springframework.data.mongodb.core.query.Criteria.where;

/**
 * MongoDB数据库基本操作接口
 * @param <T>
 */
public abstract class BaseRepositoryImpl<T> implements BaseRepository<T> {

    protected abstract Class<T> getEntityClass();

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void save(T entity) {
        this.mongoTemplate.save(entity);
    }

    @Override
    public void update(T entity) {
        /**
         * TODO
         */
    }

    @Override
    public void delete(Serializable... ids) {
        if (ArrayUtils.isNotEmpty(ids)) {
            for (Serializable _id : ids) {
                this.mongoTemplate.remove(mongoTemplate.findById(_id, this.getEntityClass()));
            }
        }
    }

    @Override
    public T find(Serializable _id) {
        return this.mongoTemplate.findById(_id,this.getEntityClass());
    }

    @Override
    public List<T> findAll() {
        return this.mongoTemplate.findAll(this.getEntityClass());
    }

    @Override
    public List<T> findAllWithSort(List<SortEnum> sort) {
        if (CollectionUtils.isEmpty(sort)) {
            return this.findAll();
        } else {
            List<Sort.Order> orderList = OrderSortParse.parseOrder(sort);
            return this.mongoTemplate.find(new Query().with(new Sort(orderList)), this.getEntityClass());
        }
    }

    @Override
    public List<T> findByProp(String propName, ObjectMapper propValue) {
        return this.findByPropWithSort(propName, propValue, null);
    }

    @Override
    public List<T> findByPropWithSort(String propName, ObjectMapper propValue, List<SortEnum> sort) {
        Query query = new Query();
        // 查询器参数
        query.addCriteria(where(propName).is(propValue));

        return null;
    }

    @Override
    public List<T> findByProps(Map<String, Object> propMaps) {
        return null;
    }

    @Override
    public List<T> findByProps(Map<String, Object> propMaps, List<SortEnum> sort) {
        return null;
    }

    @Override
    public T uniqueByProp(String propName, Object propValue) {
        return null;
    }

    @Override
    public T uniqueByProps(Map<String, Object> propMaps) {
        return null;
    }

    @Override
    public PageModel<T> pageAll(int pageNo, int pageSize) {
        return null;
    }

    @Override
    public PageModel<T> pageAllWithSort(int pageNo, int pageSize, List<SortEnum> sort) {
        return null;
    }

    @Override
    public PageModel<T> pageByProp(int pageNo, int pageSize, Map<String, Object> propMap) {
        return null;
    }

    @Override
    public PageModel<T> pageByPropWithSort(int pageNo, int pageSize, Map<String, Object> propMap, List<SortEnum> sort) {
        return null;
    }

    @Override
    public PageModel<T> pageByProps(int pageNo, int pageSize, Map<String, Object> propMaps) {
        return null;
    }

    @Override
    public PageModel<T> pageByProps(int pageNo, int pageSize, Map<String, Object> propMaps, List<SortEnum> sort) {
        return null;
    }

    @Override
    public int countByCondition(Map<String, Object> propMaps) {
        return 0;
    }
}
