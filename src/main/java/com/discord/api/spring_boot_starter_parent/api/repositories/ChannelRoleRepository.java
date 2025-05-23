package com.discord.api.spring_boot_starter_parent.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.discord.api.spring_boot_starter_parent.api.models.ChannelRole;

public interface ChannelRoleRepository extends JpaRepository<ChannelRole, Integer> {
}
