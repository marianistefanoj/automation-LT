- To Run:
> import the project at eclipse
> when the project is open, verify if it has downloaded the dependencies (all jars are dependencies)
> is necessary to have testNG 'installed' eclipse (from eclipse marketplace) to run
> MainTest.java is used to run the test

> There are three tests
>> 1st - one item added to the cart
>> 2nd - all items who have 'Sauce Labs' at the title (five items)
>> 3rd - no item will be found with the partial string that has been used and there will be logs at the console with the validations:
>>> - no items have been found using the current text : 'ASD' for example
>>> - no items have been added to the cart
>>> - the checkout cart is empty
- because with or without items the page let the user do checkout and 'finish' it


Hello,
Thanks for read.
As the intention is understand more about my skills on automation
First than do the same exercise (not exactly at the same way) with webdriverIO, i did it using selenide.
Selenide is a wrapper for selenium webdriver and based in Selenium.
it uses CSSSelector (for example to find elements), Javascript (for example setValue to fill information at the fields),Java (for general purpose)

i studied/learned selenide with this course
https://www.udemy.com/course/automacao-web-descomplicada-com-selenide/ (is in portuguese)

- Skills
> I had just a bit of contact with selenide while i was trying to help some co-workers when they were implementing some automated tests at my current company,
> But lated they choosed to use 'pure' selenium with java without selenide, but was just a bit of contact with it.
> But i did the course with the wish to learn and earn knowledge, only after i do the course the 'selenium team' has been created at the company, because the web automation process is just in the beginning.
> I still using testcomplete/vbscript daily and the structure from testcomplete to selenide (at this exercise) is quite different, because of this sometimes still being a bit difficult to 'organize' (for me),
or how to set exactly to run, or how to manage the structure of the project, but i tried do my best based on my daily contact with testcomplete.

- Design Pattern:
> I tried to use as best as i can the PageObject pattern, where at pageObjects keep all my scripts, at _Test i call the methods and fill the information when necessary and my MainTest is like my 'suite runner';
> I could at MainTest create a @Test with a method and call each method from each page objects in the MainTest and fill information when necessary right into it but the intention is:
>> the MainTest call the _Test classes and methods and only runs the test
>> the _Test classes have the methods that were created using the _PageObject functions/elements that were 'found' at the specific page
(I hope it doesn't sound so confuse, i never tried to explain it in another language)

- Considerations:
> First of all i would like to say thank you for the opportunity, knowing my actual limitations, and having the opportunity to do this exercise (even if was a simple exercise) was a good experience, and i'm really happy because based on my whole experience with selenium/selenide/webdriverIO was really fun to work with, and makes me want continue improving my knowledge on it.
> Thank you once again for the opportunity.