Feature: Position movements

Scenario: fresh to move
  Given we have fresh position
  When I move it
  Then it should be somewhere else