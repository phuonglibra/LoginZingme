
@tag
Feature: Login Zingme page
	This is description for feature Login

@tag1
Scenario: Login with invalid username
Given Open URL
When user input username is "abc"
And user click Login button
Then user check alert message is "Vui lòng nhập mật khẩu."

@tag2
Scenario: Login with invalid password
Given Open URL 
When user input username is "applifemobi"
And user input password is "123"
And user click Login button
Then user check alert message is "Tên đăng nhập / Mật khẩu bạn đã nhập không chính xác! Vui lòng thử lại (đảm bảo đã tắt caps lock)."

@tag3
Scenario: Login with invalid username and password
Given Open URL 
When user input username is "abc123"
And user input password is "123"
And user click Login button
Then user check alert message is "Tên đăng nhập / Mật khẩu bạn đã nhập không chính xác! Vui lòng thử lại (đảm bảo đã tắt caps lock)."

