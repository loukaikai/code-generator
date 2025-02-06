package cn.net.susan.generate.service;

import java.util.List;

import cn.net.susan.generate.domain.TableInfo;

/**
 * 代码生成 服务层
 *
 * @author sue
 */
public interface IGenService {
    /**
     * 查询ry数据库表信息
     *
     * @param tableInfo 表信息
     * @return 数据库表列表
     */
    List<TableInfo> selectTableList(TableInfo tableInfo);

    /**
     * 生成代码
     *
     * @param author       作者
     * @param packageName  包名称
     * @param dataBaseName 库名称
     * @param prefix       前缀
     * @param tableName    表名称
     * @param sharding     是否分库分表
     * @return 数据
     */
    byte[] generatorCode(String author, String packageName, String dataBaseName, String prefix, String tableName, String sharding);

    /**
     * 批量生成代码
     *
     * @param author       作者
     * @param packageName  包名称
     * @param dataBaseName 库名称
     * @param prefix       前缀
     * @param tableNames   表名称
     * @param sharding     是否分库分表
     * @return 数据
     */
    byte[] batchGeneratorCode(String author, String packageName, String dataBaseName, String prefix, String tableNames, String sharding);

    /**
     * 批量生成代码
     *
     * @param author       作者
     * @param packageName  包名称
     * @param dataBaseName 库名称
     * @param prefix       前缀
     * @param tableNames   表数组
     * @param sharding     是否分库分表
     * @return 数据
     */
    byte[] generatorCode(String author, String packageName, String dataBaseName, String prefix, String[] tableNames, String sharding);
}
