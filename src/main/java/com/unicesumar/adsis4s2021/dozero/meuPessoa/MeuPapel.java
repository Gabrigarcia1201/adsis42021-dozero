package com.unicesumar.adsis4s2021.dozero.meuPessoa;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import com.unicesumar.adsis4s2021.dozero.base.BaseEntity;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class MeuPapel extends BaseEntity {

}