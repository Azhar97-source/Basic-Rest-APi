/*
 * package com.zensar.careersolutionswebservice.repository;
 * 
 * import org.springframework.data.jpa.repository.JpaRepository; import
 * org.springframework.data.jpa.repository.Query; import
 * org.springframework.data.repository.query.Param;
 * 
 * import com.zensar.careersolutionswebservice.beans.Employer;
 * 
 * public interface EmployerRepository extends JpaRepository<Employer, Integer>{
 * 
 * @Query("from Employer e where e.employerEmail = :email and e.employerPassword = :password"
 * ) Employer employerLogin(@Param("email")String email,@Param("password")String
 * password) ; }
 */