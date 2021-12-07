package top.wqy.myblog.service.impl;

import top.wqy.myblog.entity.Blog;
import top.wqy.myblog.mapper.BlogMapper;
import top.wqy.myblog.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wqy
 * @since 2021-12-07
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
