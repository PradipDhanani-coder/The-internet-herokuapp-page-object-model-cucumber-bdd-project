$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/theinternetherokuapp/resources/featurefiles/keypresses.feature");
formatter.feature({
  "line": 1,
  "name": "Key presses functionality",
  "description": "As a user\r\nI want to click on key presses\r\nso i can click on four keys",
  "id": "key-presses-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10942505700,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Verify user is able to click on four keys",
  "description": "",
  "id": "key-presses-functionality;verify-user-is-able-to-click-on-four-keys",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I am on the internet herokuapp home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on key presses link",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I press A keys in field \"A\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "System should shows displayed A successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I press B keys in field \"B\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "System should shows displayed B successfully",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I press C keys in field \"C\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "System should shows displayed C successfully",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "And I press D keys in field \"D\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "System should shows displayed D successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.iAmOnTheInternetHerokuappHomePage()"
});
formatter.result({
  "duration": 268281700,
  "status": "passed"
});
formatter.match({
  "location": "KeyPressTest.iClickOnKeyPressesLink()"
});
formatter.result({
  "duration": 10689888500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "A",
      "offset": 25
    }
  ],
  "location": "KeyPressTest.iPressAKeysInField(String)"
});
formatter.result({
  "duration": 180947200,
  "status": "passed"
});
formatter.match({
  "location": "KeyPressTest.systemShouldShowsDisplayedASuccessfully()"
});
formatter.result({
  "duration": 225739000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "B",
      "offset": 25
    }
  ],
  "location": "KeyPressTest.iPressBKeysInField(String)"
});
formatter.result({
  "duration": 123359700,
  "status": "passed"
});
formatter.match({
  "location": "KeyPressTest.systemShouldShowsDisplayedBSuccessfully()"
});
formatter.result({
  "duration": 154700000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "C",
      "offset": 25
    }
  ],
  "location": "KeyPressTest.iPressCKeysInField(String)"
});
formatter.result({
  "duration": 155657400,
  "status": "passed"
});
formatter.match({
  "location": "KeyPressTest.systemShouldShowsDisplayedCSuccessfully()"
});
formatter.result({
  "duration": 176102800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "D",
      "offset": 29
    }
  ],
  "location": "KeyPressTest.andIPressDKeysInField(String)"
});
formatter.result({
  "duration": 123765200,
  "status": "passed"
});
formatter.match({
  "location": "KeyPressTest.systemShouldShowsDisplayedDSuccessfully()"
});
formatter.result({
  "duration": 74359300,
  "status": "passed"
});
formatter.after({
  "duration": 937132600,
  "status": "passed"
});
});