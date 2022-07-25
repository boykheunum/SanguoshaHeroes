package com.example.managersangoushaheroes.Impl;

import com.example.managersangoushaheroes.Entity.HeroesInfoEntity;
import com.example.managersangoushaheroes.Resposity.HeroesInfoResposity;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.util.ResourceUtils;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

@Service
public class HeroesInfoImpl {
    @Autowired
    private HeroesInfoResposity heroesInfoResposity;

    public HeroesInfoEntity createHeroInfo(HeroesInfoEntity heroesInfo) {
        return heroesInfoResposity.save(heroesInfo);
    }

    public HeroesInfoEntity UpdateHeroInfo(HeroesInfoEntity heroesInfo) {
        return heroesInfoResposity.save(heroesInfo);
    }

    public Page<HeroesInfoEntity> getAllInfoHero(Pageable pageable) {
        return heroesInfoResposity.paging(pageable);
    }

    public List<HeroesInfoEntity> getListHeroes() {
        List<HeroesInfoEntity> entityList = heroesInfoResposity.findAll();
        return entityList;
    }

    public void dowloadAllImage(String url, String fileName, HttpServletResponse response) {
        try {
            URL urlNet = new URL(url);
            BufferedInputStream bis = new BufferedInputStream(urlNet.openStream());

            FileOutputStream fis = new FileOutputStream(fileName);

            byte[] buffer = new byte[1024*5];
            int count;
            while ((count = bis.read(buffer,0,1024))!=-1){
                fis.write(buffer, 0, count);
            }
            fis.close();
            bis.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}