package com.ohgiraffers.demoelasticbeantalk.menu.service;

import com.ohgiraffers.demoelasticbeantalk.menu.dto.MenuDto;
import com.ohgiraffers.demoelasticbeantalk.menu.entity.Menu;
import com.ohgiraffers.demoelasticbeantalk.menu.repository.MenuRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class MenuService {

    private final MenuRepository menuRepository;

    public List<MenuDto> getAllMenus() {

        List<Menu> menus = menuRepository.findAll();

        List<MenuDto> menuDtos = menus.stream().map(MenuDto::new).collect(Collectors.toList());

        return menuDtos;
    }
}
