package com.baeldung.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.baeldung.entity.OAuth2UserConsent;

@Repository
public interface OAuth2UserConsentRepository extends CrudRepository<OAuth2UserConsent, String> {

    OAuth2UserConsent findByRegisteredClientIdAndPrincipalName(String registeredClientId, String principalName);

    void deleteByRegisteredClientIdAndPrincipalName(String registeredClientId, String principalName);
}
