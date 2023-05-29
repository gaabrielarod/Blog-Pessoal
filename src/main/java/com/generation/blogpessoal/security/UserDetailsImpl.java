package com.generation.blogpessoal.security;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.generation.blogpessoal.model.Usuario;

public class UserDetailsImpl implements UserDetails{
	
	private static final long serialVersionUID = 1L;
	
	private String userName;
	private String password;
	private List<GrantedAuthority> authorities;
	
	public UserDetailsImpl(Usuario user) {
		this.userName = user.getUsuario();
		this.password = user.getSenha();
	}
	
	public UserDetailsImpl() {
		
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities(){
		return authorities;
	}
	
	@Override
	public String getPassword() {
		return password;
	}
	
	@Override
	public String getUsername() {
		return userName;
	}
	
	@Override
	public boolean isAccountNonExpired() {//indica se uma conta foi expirada
		return true;
	}
	
	@Override
	public boolean isAccountNonLocked() {//indica se o usuario está bloqueado 
		return true;
	}
	
	@Override
	public boolean isCredentialsNonExpired() {//se as senhas do usuario vão expirar e se precisar ser trocada
		return true;
	}
	
	@Override
	public boolean isEnabled() {//indica se o usuario está habilitado ou desabilitado,se está autorizado
		return true;
	}
	


}
