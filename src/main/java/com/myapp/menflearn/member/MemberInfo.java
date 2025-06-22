package com.myapp.menflearn.member;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberInfo {
	private long id;
	@JoinColumn(name = "member_id")
	@OneToOne(mappedBy = "member")
	private Member member;
	private String nickname;
	private String profileImg;
	private String category;
	private String carrer;
	private String jobGroup;
	private String workPlace;

	@Builder
	public MemberInfo(Member member, String nickname, String profileImg, String category, String carrer,
		String jobGroup,
		String workPlace) {
		this.member = member;
		this.nickname = nickname;
		this.profileImg = profileImg;
		this.category = category;
		this.carrer = carrer;
		this.jobGroup = jobGroup;
		this.workPlace = workPlace;
	}
}
