package com.image.blog.service.impl;

import com.image.blog.entity.MUser;
import com.image.blog.mapper.MUserMapper;
import com.image.blog.service.IMUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Xiner
 * @since 2021-07-20
 */
@Service
public class MUserServiceImpl extends ServiceImpl<MUserMapper, MUser> implements IMUserService {

}
