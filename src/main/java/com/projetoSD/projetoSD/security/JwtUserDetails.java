package com.projetoSD.projetoSD.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


public class JwtUserDetails implements UserDetails {

	  private static final long serialVersionUID = 5155720064139820502L;

	  private final Long id;
	  private final String username;
	  private final String password;
	  private final Collection<? extends GrantedAuthority> authorities;

	  public JwtUserDetails(Long id, String username, String password, String role) {
	    this.id = id;
	    this.username = username;
	    this.password = password;

	    List<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
	    authorities.add(new SimpleGrantedAuthority(role));

	    this.authorities = authorities;
	  }

	  @JsonIgnore
	  public Long getId() {
	    return id;
	  }

	  @Override
	  public String getUsername() {
	    return username;
	  }

	  @JsonIgnore
	  @Override
	  public boolean isAccountNonExpired() {
	    return true;
	  }

	  @JsonIgnore
	  @Override
	  public boolean isAccountNonLocked() {
	    return true;
	  }

	  @JsonIgnore
	  @Override
	  public boolean isCredentialsNonExpired() {
	    return true;
	  }

	  @JsonIgnore
	  @Override
	  public String getPassword() {
	    return password;
	  }

	  @Override
	  public Collection<? extends GrantedAuthority> getAuthorities() {
	    return authorities;
	  }

	  @Override
	  public boolean isEnabled() {
	    return true;
	  }

	}
