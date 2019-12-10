Feature: Test CRUD of To Do list page

  Background:
    Given i entered into ToDoList page

  @Crear
  Scenario: Add a new to do item.
    When i add take a shower item to market
    Then i see the item is added successfully


  @Editar
  Scenario: Edit an existent to do item.
    When i edit take a shower for brush teeth
    Then i see the item is modified

  @Eliminar
  Scenario: Delete an existent to do item
    When i delete brush teeth item
    Then i see the item is deleted