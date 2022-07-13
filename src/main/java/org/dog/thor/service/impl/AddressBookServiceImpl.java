package org.dog.thor.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.dog.thor.entity.AddressBook;
import org.dog.thor.service.AddressBookService;
import org.dog.thor.mapper.AddressBookMapper;
import org.springframework.stereotype.Service;

/**
* @author zhanghaojian
* @description 针对表【address_book(地址管理)】的数据库操作Service实现
* @createDate 2022-07-13 19:12:51
*/
@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook>
    implements AddressBookService{

}




