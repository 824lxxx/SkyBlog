package com.danli.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.danli.entity.Visitor;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author fanfanli
 * @since 2021-04-08
 */
public interface VisitorService extends IService<Visitor> {
    boolean hasUUID(String uuid);

}
