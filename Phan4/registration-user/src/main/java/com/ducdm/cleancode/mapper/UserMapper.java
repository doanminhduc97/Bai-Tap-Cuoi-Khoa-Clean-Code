package com.ducdm.cleancode.mapper;

import com.ducdm.cleancode.dto.UserDto;
import com.ducdm.cleancode.dto.UserResponseDto;
import com.ducdm.cleancode.entity.Student;
import com.ducdm.cleancode.entity.Teacher;
import com.ducdm.cleancode.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User convertToTeacher(UserDto userDto){
        Teacher teacher = new Teacher();
        teacher.setEmail(userDto.getEmail());
        teacher.setName(userDto.getName());
        teacher.setPassword(userDto.getPassword());
        teacher.setExperiences(userDto.getTeacher().getExperiences());
        teacher.setPhone(userDto.getTeacher().getPhone());

        return teacher;
    }

    public User convertToStudent(UserDto userDto){
        Student student = new Student();
        student.setEmail(userDto.getEmail());
        student.setName(userDto.getName());
        student.setPassword(userDto.getPassword());
        student.setYear(userDto.getStudent().getYear());

        return student;
    }

	public UserResponseDto convertToUserResponseDto(User createdUser) {
		UserResponseDto responseDto = new UserResponseDto();
		responseDto.setEmail(createdUser.getEmail());
		responseDto.setName(createdUser.getName());
		return responseDto;
	}
}
