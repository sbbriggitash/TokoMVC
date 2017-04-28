/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.control;

import java.util.List;
import javax.swing.JOptionPane;
import pack.dao.daoToko;
import pack.dao.implementToko;
import pack.model.m_toko;
import pack.view.login;

/**
 *
 * @author Briggita
 */
public class controllerToko
{
    login hm;
    implementToko impToko;
    List<m_toko> lt;
    
    public controllerToko(login hm)
    {
        this.hm = hm;
        impToko = new daoToko();
        lt = impToko.getAll();
    }
    
    //mengosongkan isian field
    public void Reset()
    {
        hm.getKode().setText("");
        hm.getNama().setText("");
        hm.getHarga().setText("");
        hm.getKategori().setSelectedItem(null);
        hm.getJenis().setSelectedItem(null);
    }
    
    //menghapus data yang dipilih
    public void Hapus()
    {
        if (!hm.getKode().getText().trim().isEmpty())
        {
            else
            {
                    String kode = (hm.getKode().getText());
                    impToko.HapusData(kode);
                    JOptionPane.showMessageDialog(hm, "Data berhasil dihapus");
            }
        }
        
        //menyimpan data
        public void SimpanData()
        {
            m_toko toko = new m_toko();
            toko.setkode(hm.getKode().getText());
            toko.setnama(hm.getNama().getText());
            toko.setharga(hm.getHarga().getText());
            
            toko.setkategori(hm.getKategori().getSelectedItem().toString());
            toko.setjenis(hm.getJenis().getSelectedItem().toString());
            impToko.SimpanData(toko);
        }
        
        //mengubah data
        public void Ubah()
        {
            m_toko toko = new m_toko();
            toko.setkode(hm.getKode().getText());
            toko.setnama(hm.getNama().getText());
        }
        
        toko.setkategori(hm.getKategori().getSelectedItem().toString());
        toko.setjenis(hm.getJenis().getSelectedItem().toString());
        toko.setharga(hm.getHarga().getText());
        impToko.UbahData(toko);
    }

    public void isiTable()
    {
        lt = impToko.getAll();
        tableModelToko tmt = new tableModelToko(lt);
        hm.getTableData().setModel(tmt);
    }
    
    public void isiField(int row)
    {
        hm.getKode().setText(lt.get(row).getkode().toString());
        hm.getNama().setText(lt.get(row).getnama().toString());
        
        hm.getKategori().setSelectedItem(lt.get(row).getkategori().toString());
        hm.getJenis().setSelectedItem(lt.get(row).getjenis().toString());
        hm.getHarga().setText(lt.get(row).getharga().toString());

    public void CariKategori()
    {
        if (hm.getCariKategori().getSelectedItem().toString().isEmpty())
        {
            impToko.getCariKategori((String)hm.getCariKategori().getSelectedItem());
            isiTableCariKategori();
        } else
        {
            JOptionPane.showMessageDialog(hm, "Silakan Pilih Kategori");
        }
    }

    private void isiTableCariKategori()
    {
        lt = impToko.getCariKategori((String)hm.getKategori().getSelectedItem());
        tableModelToko tmt = new tableModelToko(lt);
        hm.getTableData().setModel(tmt);
    }
}
}