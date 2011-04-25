/*
 *  Copyright (C) 2010 {Apertum}Projects. web: www.apertum.ru email: info@apertum.ru
 * 
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 * 
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package ru.apertum.qsystem.common;

/**
 * Перечисление состояний кастомера в которых он может находиться
 * @author Evgeniy Egorov
 */
public enum CustomerState {
    // значения состояния "очередника"

    /**
     * удален по неявке
     */
    STATE_DEAD,
    /**
     * стоит и ждет в очереди
     */
    STATE_WAIT,
    /**
     * пригласили
     */
    STATE_INVITED,
    /**
     * пригласили повторно в цепочке обработки. т.е. клиент вызван к оператору не первый раз а после редиректа или отложенности
     */
    STATE_INVITED_SECONDARY,
    /**
     * отправили в другую очередь, идет как бы по редиректу в верх.
     * Стоит ждет к новой услуге.
     */
    STATE_REDIRECT,
    /**
     * начали с ним работать
     */
    STATE_WORK,
    /**
     * начали с ним работать повторно в цепочке обработки
     */
    STATE_WORK_SECONDARY,
    /**
     * состояние когда кастомер возвращается к прежней услуге после редиректа,
     * по редиректу в низ. Стоит ждет к старой услуге.
     */
    STATE_BACK,
    /**
     * с кастомером закончили работать и он идет домой
     */
    STATE_FINISH,
    /**
     * с кастомером закончили работать и поместили в отложенные. домой не идет, сидит ждет покуда не вызовут.
     */
    STATE_POSTPONED
}
